resultsPerPage = 5
results = [
  "1,28,300.6,San Francisco",
  "4,5,209.1,San Francisco",
  "20,7,203.4,Oakland",
  "6,8,202.9,San Francisco",
  "6,10,199.8,San Francisco",
  "1,16,190.5,San Francisco",
  "6,29,185.3,San Francisco",
  "7,20,180.0,Oakland",
  "6,21,162.2,San Francisco",
  "2,18,161.7,San Jose",
  "2,30,149.8,San Jose",
  "3,76,146.7,San Francisco",
  "2,14,141.8,San Jose"]


output = [
  "1,28,300.6,San Francisco",
  "4,5,209.1,San Francisco",
  "20,7,203.4,Oakland",
  "6,8,202.9,San Francisco",
  "7,20,180.0,Oakland",
  "", # this is a page separator
  "6,10,199.8,San Francisco",
  "1,16,190.5,San Francisco",
  "2,18,161.7,San Jose",
  "3,76,146.7,San Francisco",
  "6,29,185.3,San Francisco",
  "", # this is a page separator
  "6,21,162.2,San Francisco",
  "2,30,149.8,San Jose",
  "2,14,141.8,San Jose"]


#
def paginate(num, results):
    #
    # Write your code here.
    #

    unused = set(results)
    used = set()
    return_arr = []
    while len(used) == results:
        used_ids = set()
        arr = []
        for e in results:
            host_id = e.strip().split(",")[0]
            if host_id not in used_ids:
                arr.append(e)
                used.add(e)
                unused.discard(e)
            if len(used)%num == 0:
                break
            if len(unused) == 0:
                break

        for e in results:
            if e not in used:
                arr.append(e)
                used.discard(e)
            if len(arr) >= num:
                break

        results = hosts[:]
        arr.append("")
        return_arr.extend(arr[:])

    return return_arr