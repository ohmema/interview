"""
 In a microservices environment, we have a hashmap of service to service dependencies:

        {
            'A': {'B', 'C'},
            'D': {'B', 'E', 'F', 'G'},
            'B': {'H', 'I', 'J'},
        }

    If a service A changes, what are the services that depend on it that need to be retested?

    Examples:
      get_reverse_dependencies('I') == {'B', 'D', 'A'}
      get_reverse_dependencies('A') == set()  # empty set
"""

map = {
    'A': {'B', 'C'},
    'D': {'B', 'E', 'F', 'G'},
    'B': {'H', 'I', 'J'},
    'C': {'A', 'D'}
}

def get_retest_services(map, changed_service):
    result_set = set()
    for k, s in map.items():
        if changed_service in s:
            result_set.add(k)

    return result_set


print(map, end=" : ")
print(get_retest_services(map, 'A'))
print(map, end=" : ")
print(get_retest_services(map, 'B'))