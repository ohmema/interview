from queue import PriorityQueue
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


def sort_rate_with_different_host(num, results):
    pages = results[:]
    return_pages = []
    while len(pages) != 0:
        used_hosts = set()
        batch = []

        for e in results:
            host_id = e.strip().split(",")[0]
            if host_id not in used_hosts:
                batch.append(e)
                used_hosts.add(host_id)
                pages.remove(e)
            if len(used_hosts) >= num:
                break
            if len(pages) == 0:
                break

        for e in pages:
            batch.append(e)
            pages.remove(e)
            if len(batch) >= num:
                break

        results = pages[:]
        batch.append("")
        return_pages.extend(batch[:])

    return return_pages

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

import pprint
pprint.pprint(sort_rate_with_different_host(5, results))








