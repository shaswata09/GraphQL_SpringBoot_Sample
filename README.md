# GraphQL_SpringBoot_Sample

# Basic GraphiQL Queries and docs.

# GraphQL queries typically start with a "{" character. Lines that starts
# with a # are ignored.
#
# An example GraphQL query might look like:
#
#     {
#       field(arg: "value") {
#         subField
#       }
#     }
#
# Keyboard shortcuts:
#
#  Prettify Query:  Shift-Ctrl-P (or press the prettify button above)
#
#     Merge Query:  Shift-Ctrl-M (or press the merge button above)
#
#       Run Query:  Ctrl-Enter (or press the play button above)
#
#   Auto Complete:  Ctrl-Space (or just start typing)
#

##################################################################

# {
#   characters {
#     id
#     name
#     age
#   }
# }


# {
#   characterById(id: "Char3") {
#     id
#     name
#     age
#   }
# }


# mutation {
#   addCharacter(name: "New Character", age: 21) {
#     id
#     name
#     age
#   }
# }


##############################################################

# {
#   groups {
#     name
#     orientation
#   }
# }


# {
#   groupByName(name: "Bad Dudes"){
#     name
#     orientation
#   }
# }


# mutation {
#   addGroup(name: "Good Guyz" orientation:HERO) {
#     name
#     orientation
#   }
# }
